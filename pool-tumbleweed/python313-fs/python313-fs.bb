SUMMARY = "Python's filesystem abstraction layer"
DESCRIPTION = "PyFilesystem is an abstraction layer for filesystems. In the same way that \
Python's file-like objects provide a common way of accessing files, \
PyFilesystem provides a common way of accessing entire filesystems. You can \
write platform-independent code to work with local files, that also works with \
any of the supported filesystems (zip, ftp, S3 etc.)."
LICENSE = "MIT"

PV = "2.4.16"

RPM_NAME = "python313-fs-2.4.16-7.1.noarch.rpm"
RPM_HASH = "1a0a52d44e10322b284fcb819abdd3b096613cd65a5a92fd3ccb6c25f68bae2741224942ac193188b0a40bfcc30a239ae1f59f49307988800c46193e5c489cd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fs \
python3.13dist-fs \
python313-fs \
python3dist-fs"

RDEPENDS:${PN} += "python-abi \
python313-appdirs \
python313-setuptools \
python313-six"

inherit rpm
