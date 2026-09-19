SUMMARY = "Python's filesystem abstraction layer"
DESCRIPTION = "PyFilesystem is an abstraction layer for filesystems. In the same way that \
Python's file-like objects provide a common way of accessing files, \
PyFilesystem provides a common way of accessing entire filesystems. You can \
write platform-independent code to work with local files, that also works with \
any of the supported filesystems (zip, ftp, S3 etc.)."
LICENSE = "MIT"

PV = "2.4.16"

RPM_NAME = "python314-fs-2.4.16-7.1.noarch.rpm"
RPM_HASH = "674cd8a2de0ceb9785ed33cce03f4f4b298c796e1bbe368a9143106f85e3e3746a50abb1919699926272fcc4fe807632fff575581bb4bcf7a1619c181c4556c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fs \
python314-fs \
python3dist-fs"

RDEPENDS:${PN} += "python-abi \
python314-appdirs \
python314-setuptools \
python314-six"

inherit rpm
