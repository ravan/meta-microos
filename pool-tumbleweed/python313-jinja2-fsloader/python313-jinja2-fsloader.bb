SUMMARY = "Jinja2 template loader using PyFilesystem2"
DESCRIPTION = "This library allows using PyFilesystem2 as a backend to load \
templates into Jinja2. You can take advantage of the whole fs \
ecosystem, which already implements drivers for FTP, SSH, SMB, S3, \
WebDAV servers, ZIP and Tar archives and others."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-jinja2-fsloader-0.3.0-4.5.noarch.rpm"
RPM_HASH = "6d0eb5201b863613f54592b789d48a7dc1443b326e50f2c9fbbcb4d564e5f8de939a98c9106c29d49a1dfe3a77b7b324f29fdc7a0dd313184201b4dd7fc1c701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jinja2-fsloader \
python3.13dist-jinja2-fsloader \
python313-jinja2-fsloader \
python3dist-jinja2-fsloader"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-fs"

inherit rpm
