SUMMARY = "Development files for OpenSM"
DESCRIPTION = "Symlinks for the dynamic libraries and header files for OpenSM."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "opensm-devel-3.3.24-5.4.aarch64.rpm"
RPM_HASH = "5ffd002b54c8ed5bcfbadc67f77f9e19b7f7c5152e894ee7699e7ebc60019a506e96d10b45db4637746164b9dd64d14c9cbc1124091f0be382c043f28234c03a"

RPROVIDES:${PN} += "opensm-devel"

RDEPENDS:${PN} += "libibumad-devel \
libopensm9 \
libosmcomp5 \
libosmvendor5"

inherit rpm
