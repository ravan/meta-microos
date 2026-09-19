SUMMARY = "An embeddable Javascript interpreter"
DESCRIPTION = "MuJS is a lightweight Javascript interpreter designed for embedding in other software to extend them with scripting capabilities."
LICENSE = "ISC"

PV = "1.3.7"

RPM_NAME = "mujs-1.3.7-3.5.aarch64.rpm"
RPM_HASH = "c1e461007deea0ffcfbad7ce216159a2c893e397bb95f9297b46c3054383c74b397507e1e3fb91baada6e3b8d415b9863c77f02aa33930494137d32a892d0378"

RPROVIDES:${PN} += "mujs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8"

inherit rpm
