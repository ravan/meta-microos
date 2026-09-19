SUMMARY = "Development files for libsearpc"
DESCRIPTION = "The libsearpc-devel package contains libraries and header files for \
developing applications that use libsearpc."
LICENSE = "Apache-2.0"

PV = "3.3.0.20250303"

RPM_NAME = "libsearpc-devel-3.3.0.20250303-1.6.aarch64.rpm"
RPM_HASH = "5b3ce06c53a810cb7292af31231d3c45441b60c951c731b30f284b88041ba01509eb6ec9318d30dbf8fc818b71dd5990f023ff60ab9ce916f56b7202ac4465ed"

RPROVIDES:${PN} += "libsearpc-devel \
pkgconfig-libsearpc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
libsearpc1 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-jansson"

inherit rpm
