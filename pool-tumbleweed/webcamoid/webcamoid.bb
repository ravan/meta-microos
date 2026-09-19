SUMMARY = "Webcam applet for Plasma"
DESCRIPTION = "Webcam applet for Plasma. \
 \
Features: \
* Take pictures with the webcam. \
* Record videos. \
* Manages multiple webcams. \
* Play/Stop capture, this saves resources while the applet is not in use. \
* Written in C++. \
* Qt based software. \
* Custom controls for each webcam. \
* Popup applet support (you can embed Webcamoid in the panel). \
* +50 video effects available. \
* Effects with live previews. \
* Translated to many languages. \
* Stand alone installation mode (use it as a normal program). \
* Use custom network and local files as capture devices. \
* Capture from desktop."
LICENSE = "GPL-3.0-or-later"

PV = "9.4.0"

RPM_NAME = "webcamoid-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "e8644cd9a24768f0848668e0110502c10a071e44317cca64f8133fc97b960c19a6844e23e6d2eb0b6ca029768f29e944a4a98d629788fa71f7999e2da8a261f0"

RPROVIDES:${PN} += "libAdjustHSL.so \
libAspectRatio.so \
libAudioDevice-pipewire.so \
libAudioDevice-pulseaudio.so \
libAudioDevice.so \
libAudioEncoder-ffmpeg.so \
libBlur.so \
libChangeHSL.so \
libColorFilter.so \
libColorKey.so \
libColorReplace.so \
libColorTap.so \
libColorTransform.so \
libContrast.so \
libConvolve.so \
libCrop.so \
libDelayGrab.so \
libDenoise.so \
libDesktopCapture-ffmpeg.so \
libDesktopCapture-pipewire.so \
libDesktopCapture-qtscreen.so \
libDesktopCapture-wlroots.so \
libDesktopCapture-xlib.so \
libDesktopCapture.so \
libDistort.so \
libDizzy.so \
libEqualize.so \
libFaceDetect.so \
libFalseColor.so \
libFillAudioGaps.so \
libFlip.so \
libFpsControl.so \
libFrameOverlap.so \
libGamma.so \
libHalftone.so \
libImageSrc.so \
libImplode.so \
libLife.so \
libMatrixTransform.so \
libMultiSrc-ffmpeg.so \
libMultiSrc.so \
libNervous.so \
libNormalize.so \
libOilPaint.so \
libOpacity.so \
libPacketSync.so \
libPhotocopy.so \
libQuark.so \
libRipple.so \
libRotate.so \
libSaturated.so \
libScanLines.so \
libShagadelic.so \
libSimdCore-neon.so \
libSimdCore-sve.so \
libSwapRB.so \
libTemperature.so \
libVideoCapture-ffmpeg.so \
libVideoCapture-pipewire.so \
libVideoCapture-qtcamera.so \
libVideoCapture-v4l2sys.so \
libVideoCapture-v4lutils.so \
libVideoCapture.so \
libVideoEncoder-ffmpeg.so \
libVideoMuxer-ffmpeg.so \
libVirtualCamera-akvcam.so \
libVirtualCamera-v4l2lb.so \
libVirtualCamera.so \
libWarp.so \
libWave.so \
libZoom.so \
libavkys.so.9 \
plasmoid-webcamoid \
webcamoid"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libavcodec.so.62 \
libavdevice.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libpipewire-0.3.so.0 \
libpulse-simple.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
libswscale.so.9 \
libusb-1.0.so.0 \
libv4l2.so.0 \
libwayland-client.so.0"

inherit rpm
