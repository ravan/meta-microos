SUMMARY = "Python ntpsec bindings"
DESCRIPTION = "The ntpsec python bindings used by various ntp utilities."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.5"

RPM_NAME = "python3-ntp-1.2.5-1.1.aarch64.rpm"
RPM_HASH = "50c207b15bbd92f7d81e417b6c4df9c41a887fdb452eec3be82cab2cce6080136ad85877dad5de7f1ea2c34e72ac23a178f432f837662760641c4ffd4d54ff38"

RPROVIDES:${PN} += "python3-ntp \
python3.13dist-ntpsec \
python3dist-ntpsec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
