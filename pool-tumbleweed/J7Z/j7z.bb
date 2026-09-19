SUMMARY = "Java-based P7Zip GUI for data compression and backup"
DESCRIPTION = "J7Z is an alternative 7-Zip GUI. (7-Zip is a file archiver.) \
With J7Z, you can update existing archive, backup multiple \
directories to a storage location, create or extract protected \
archives. It allows using archiving profiles and lists."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "J7Z-1.4.2-3.5.noarch.rpm"
RPM_HASH = "9ce4eae09181736d24ed8b28157d2bcb1a5b71570b4a55d31ff383ca5749a51049a7588ad8f1f846de5dbb8a15391ef2e8c21d9c91f1e67894e0e39ec2cd8ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "J7Z"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
java \
p7zip"

inherit rpm
