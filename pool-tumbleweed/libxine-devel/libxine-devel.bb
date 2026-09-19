SUMMARY = "Development environment for xine-based media players"
DESCRIPTION = "This package contains all necessary include files, libraries and \
configuration files needed to compile applications that use the xine \
media player. \
 \
xine is a video player which supports a large number of file formats \
(i.e., VCD, MPEG2) using plug-ins. Several plug-ins are included. \
Others can be post-installed. Supports stereo sound using OSS and AC5.1 \
using Alsa. \
 \
 \
This version of xine may lack certain features because of legal \
requirements (potential patent violation). See also \
http://en.opensuse.org/XINE#Legal_Matters \
 \
 \
More information about xine plug-ins can be found at \
http://www.xine-project.org/home \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.2.13"

RPM_NAME = "libxine-devel-1.2.13-11.5.aarch64.rpm"
RPM_HASH = "e8372015fbcda07a3100d6b19024ea5ab52de40a9bc3c72b0de52172a4fb43de1f404249952e141d581f0692f673c20ed18d5a6fd4577e560c92865f09ca438c"

RPROVIDES:${PN} += "libxine-devel \
libxine2-devel \
pkgconfig-libxine \
xine-devel \
xine-lib2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libxine2 \
pkgconfig-freetype2 \
pkgconfig-libv4l2 \
pkgconfig-zlib"

inherit rpm
