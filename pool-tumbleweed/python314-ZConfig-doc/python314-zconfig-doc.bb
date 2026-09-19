SUMMARY = "Structured Configuration Library"
DESCRIPTION = "This package contains documentation files for python314-ZConfig."
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python314-ZConfig-doc-4.3-1.4.noarch.rpm"
RPM_HASH = "b6b387eaed6f16084360fde8bb3a4771e3bd4309d748b91db9f76db0b9cf27698f8d5b342f6cc804b2df694a2533f2a05e0ba0ea342bd7e027440d7171f0a0ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-ZConfig-doc"

RDEPENDS:${PN} += "python314-ZConfig"

inherit rpm
