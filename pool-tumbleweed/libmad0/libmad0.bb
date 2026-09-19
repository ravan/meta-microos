SUMMARY = "An MPEG audio decoder library"
DESCRIPTION = "MAD is a MPEG audio decoder. It currently supports MPEG-1 and the \
MPEG-2 extension to Lower Sampling Frequencies, as well as the \
so-called MPEG 2.5 format. All three audio layers (Layer I, Layer II, \
and Layer III a.k.a. MP3) are implemented. \
 \
MAD supports 24-bit PCM output. MAD computes using 100% fixed-point \
(integer) computation, so you can run it without a floating point \
unit."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.4"

RPM_NAME = "libmad0-0.16.4-1.3.aarch64.rpm"
RPM_HASH = "93191607825e3103146898fba6acbe049d49ee8b65e0121d6102188b63771afa922ba45478e056c5f24790c39c0dd2b28577c80edaea217b428e3eed10502013"

RPROVIDES:${PN} += "libmad.so.0 \
libmad0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
