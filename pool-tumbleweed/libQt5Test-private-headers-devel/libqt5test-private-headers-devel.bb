SUMMARY = "Non-ABI stable experimental API for the Qt5 test library"
DESCRIPTION = "This package provides private headers of libQt5Test that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Test-private-headers-devel-5.15.19+kde96-1.3.noarch.rpm"
RPM_HASH = "1c0d90f2017eb5b28faa948c0d8b27657664b93a2b1d6b829faeffdb45de71ccda8a1db491ffd873f89db713a76c47208e1db996dee13a23d24d6fe2ab302806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Test-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Test-devel"

inherit rpm
