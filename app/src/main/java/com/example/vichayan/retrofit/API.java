package com.example.vichayan.retrofit;


import com.example.vichayan.APIModel.AllConnectionModel;
import com.example.vichayan.APIModel.CommentBody;
import com.example.vichayan.APIModel.CommentLikeRequest;
import com.example.vichayan.APIModel.CommentResponse;
import com.example.vichayan.APIModel.FreindRequest;
import com.example.vichayan.APIModel.FreindRequestResponse;
import com.example.vichayan.APIModel.FreindSuggestion;
import com.example.vichayan.APIModel.LikeDislikeModel;
import com.example.vichayan.APIModel.LikeResponse;
import com.example.vichayan.APIModel.PicUploadResponse;
import com.example.vichayan.APIModel.PostModelResponse;
import com.example.vichayan.APIModel.Posts;
import com.example.vichayan.APIModel.RespondRequest;
import com.example.vichayan.APIModel.SearchKeyword;
import com.example.vichayan.APIModel.SearhResponse;
import com.example.vichayan.APIModel.ShowLikedRequest;
import com.example.vichayan.APIModel.User;
import com.example.vichayan.APIModel.UserModel;
import com.example.vichayan.APIModel.UserPicResponse;

import java.util.List;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface API {
    @POST("login")
    Call<UserModel> Login(@Body UserModel userModel);

    @POST("register")
    Call<UserModel> SignUp(@Body UserModel userModel);

    @DELETE("post/{id}")
    Call<ResponseBody> deletePost(@Path("id") String str, @Header("Authorization") String str2);

    @PUT("post/{id}")
    Call<ResponseBody> editPost(@Path("id") String str, @Header("Authorization") String str2, @Body Posts posts);

    @GET("post")
    Call<PostModelResponse> getAllPosts(@Header("Authorization") String str);

    @POST("getComment")
    Call<CommentResponse> getComments(@Header("Authorization") String str, @Body ShowLikedRequest showLikedRequest);

    @GET("showRequest")
    Call<FreindRequestResponse> getFreindRequests(@Header("Authorization") String str);

    @GET("friendSuggestion")
    Call<List<FreindSuggestion>> getFreindSuggestions(@Header("Authorization") String str);

    @GET("friends")
    Call<List<AllConnectionModel>> getFreinds(@Header("Authorization") String str);

    @GET("post")
    Call<PostModelResponse> getNextPosts(@Query("page") String str, @Header("Authorization") String str2);

    @GET("user")
    Call<User> getUserData(@Header("Authorization") String str);

    @GET("getPost")
    Call<PostModelResponse> getsavedPosts(@Header("Authorization") String str);

    @POST("setCommentsLike")
    Call<ResponseBody> likeComment(@Header("Authorization") String str, @Body CommentLikeRequest commentLikeRequest);

    @POST("post/like")
    Call<ResponseBody> likeOrDislikePost(@Header("Authorization") String str, @Body LikeDislikeModel likeDislikeModel);

    @POST("post/comment")
    Call<ResponseBody> postComment(@Header("Authorization") String str, @Body CommentBody commentBody);

    @POST("connection")
    Call<ResponseBody> respondRequest(@Header("Authorization") String str, @Body RespondRequest respondRequest);

    @POST("post/save")
    Call<ResponseBody> savePost(@Header("Authorization") String str, @Body ShowLikedRequest showLikedRequest);

    @POST("search")
    Call<SearhResponse> search(@Header("Authorization") String str, @Body SearchKeyword searchKeyword);

    @POST("connect")
    Call<FreindRequest> sendFreindRequest(@Header("Authorization") String str, @Body FreindRequest freindRequest);

    @POST("post/liked")
    Call<LikeResponse> showLiked(@Header("Authorization") String str, @Body ShowLikedRequest showLikedRequest);

    @POST("post")
    Call<Posts> uploadPost(@Header("Authorization") String str, @Body Posts posts);

    @POST("myProfile/upload")
    @Multipart
    Call<PicUploadResponse> uploadUserPostPic(@Header("Authorization") String str, @Part MultipartBody.Part part);

    @POST("myProfile/pic")
    @Multipart
    Call<UserPicResponse> uploadUserProfilePic(@Header("Authorization") String str, @Part MultipartBody.Part part);
}
