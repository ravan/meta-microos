SUMMARY = "Library to access different kinds of (video) capture devices"
DESCRIPTION = "Unicap provides a uniform interface to video capture devices. It allows \
applications to use any supported video capture device via a single API. \
The included ucil library provides easy to use functions to render text \
and graphic overlays onto video images."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.12"

RPM_NAME = "libunicap2-0.9.12-26.6.aarch64.rpm"
RPM_HASH = "97b5c026fd940ed34bf0e604fb882f7c34b36d093a557bad187bd363383e1c2d6ce3030adf41df1e4d909fc7e144aa539c94fc1fd658b16e2961d7a78e29ffa4"

RPROVIDES:${PN} += "libeuvccam-cpi.so \
libunicap.so.2 \
libunicap2 \
libv4l2cpi.so \
unicap"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libraw1394.so.11"

inherit rpm
