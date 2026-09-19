SUMMARY = "Jinja2 template loader using PyFilesystem2"
DESCRIPTION = "This library allows using PyFilesystem2 as a backend to load \
templates into Jinja2. You can take advantage of the whole fs \
ecosystem, which already implements drivers for FTP, SSH, SMB, S3, \
WebDAV servers, ZIP and Tar archives and others."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-jinja2-fsloader-0.3.0-4.5.noarch.rpm"
RPM_HASH = "64da7af545af61876073682a8239389324d7582479869838cc2a6ec8921408df9c054ce4743661586ed7a2bc1caf8a5a2c1d05c43a549cb154be6caf558b5acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jinja2-fsloader \
python314-jinja2-fsloader \
python3dist-jinja2-fsloader"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-fs"

inherit rpm
