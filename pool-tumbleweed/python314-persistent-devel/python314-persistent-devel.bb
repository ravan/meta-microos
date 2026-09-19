SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains the files needed for binding the python314-persistent C module."
LICENSE = "ZPL-2.1"

PV = "6.8"

RPM_NAME = "python314-persistent-devel-6.8-1.1.aarch64.rpm"
RPM_HASH = "e391cd0cd48050794bf20a864f5b90df2f2bd804ddd2733ef4c3dd6adf3e3df72d864796b331047834ed73e8aeae340abd5a79c6334b2e8ba9ffa70ee541ea9f"

RPROVIDES:${PN} += "python314-persistent-devel"

RDEPENDS:${PN} += "python314-devel \
python314-persistent"

inherit rpm
