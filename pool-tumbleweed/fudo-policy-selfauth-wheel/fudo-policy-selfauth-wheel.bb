SUMMARY = "fudo policy wheel group members use own password"
DESCRIPTION = "Members of the wheel group use their own password to authenticate \
as root"
LICENSE = "MIT"

PV = "0"

RPM_NAME = "fudo-policy-selfauth-wheel-0-1.9.aarch64.rpm"
RPM_HASH = "726f7eaa78e385e0e4363470fd1213a06c73a57208ca83fbd0b47c5f002afc80148d2eaa09fb2449c1fd4dbcd71d256b592031cf8bcf3fc17336c6cabdd3f572"

RPROVIDES:${PN} += "fudo-policy \
fudo-policy-selfauth-wheel"

RDEPENDS:${PN} += "group-wheel"

inherit rpm
