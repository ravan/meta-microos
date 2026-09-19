SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "15.3.0+git11272"

RPM_NAME = "libm2min20-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "2dfa56cab80c102594b8d2f57a7ead1e577d2ec81db14f1fd92bf0116fbc1481c4dd998eeaf691d78054bee15531367de2c70e3b118639f4b51e59ab49d90591"

RPROVIDES:${PN} += "libm2min.so.20 \
libm2min20"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
