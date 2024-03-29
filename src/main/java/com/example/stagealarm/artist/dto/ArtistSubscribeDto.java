package com.example.stagealarm.artist.dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ArtistSubscribeDto {
  private Long userId;
  private Long artistId;
  private Long subscribes;
}
