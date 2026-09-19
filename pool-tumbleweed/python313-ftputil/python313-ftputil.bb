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

RPM_NAME = "python313-ftputil-5.2.0-1.2.noarch.rpm"
RPM_HASH = "969fe9fac3db473143ebe58872287c36135567fcbea687b6e55ab9bff3e8a21e02a72bcabbd40b711d7a487f20cb0bc0dfdf47af7fe10f3d97df8716e69591b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ftputil \
python3.13dist-ftputil \
python313-ftputil \
python3dist-ftputil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
