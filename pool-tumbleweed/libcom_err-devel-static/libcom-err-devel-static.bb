SUMMARY = "Development files for libcom_err, static libraries"
DESCRIPTION = "Development files for the com_err error message display library. Static libraries."
LICENSE = "MIT"

PV = "1.47.3"

RPM_NAME = "libcom_err-devel-static-1.47.3-2.2.aarch64.rpm"
RPM_HASH = "520b46141571ece2be4889feb06d3312c7f66a12c08099a972a3b04b6a8e83e97f279dd3759aaa33350b64dca131e8ae14f2ea224f6d313e3aefeec9c523e46d"

RPROVIDES:${PN} += "libcom-err-devel-/usr/lib64/libcom-err.a \
libcom-err-devel-/usr/lib64/libss.a \
libcom-err-devel-static"

RDEPENDS:${PN} += "libcom-err-devel"

inherit rpm
