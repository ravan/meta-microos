SUMMARY = "High-level FTP client library (virtual file system and more) for Python"
DESCRIPTION = "FTPutil is a high-level FTP client library for the Python programming \
language. ftputil implements a virtual file system for accessing FTP \
servers, that is, it can generate file-like objects for remote files. \
The library supports many functions similar to those in the os, \
os.path and shutil modules. ftputil has convenience functions for \
conditional uploads and downloads, and handles FTP clients and \
servers in different timezones."
LICENSE = "BSD-3-Clause"

PV = "5.2.0"

RPM_NAME = "python314-ftputil-5.2.0-1.2.noarch.rpm"
RPM_HASH = "73fc20ebdde27e1131d567b6af62ee3a9b194d010086503d6f806f93e47da70379e3a8394c2addf429ae1c5e8ec8f04510d7a00f66b88f93642d4d4a9d0ff02a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ftputil \
python314-ftputil \
python3dist-ftputil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
