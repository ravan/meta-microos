SUMMARY = "Taylor UUCP using xinetd"
DESCRIPTION = "Unix to Unix copy with xinetd setup instead of using modern systemd \
service units."
LICENSE = "GPL-2.0-or-later"

PV = "1.07"

RPM_NAME = "uucp-xinetd-1.07-10.1.aarch64.rpm"
RPM_HASH = "562c26d062d70a3bb2f932bef8e7600318ac930826834451bfbb7261fe21d06202b8fec47abf5838daa2a427c5efef6f8df90c0d4f0b191d12114e90bb8c2e65"

RPROVIDES:${PN} += "config-uucp-xinetd \
uucp-xinetd"

RDEPENDS:${PN} += "group-uucp \
user-uucp \
uucp \
xinetd"

inherit rpm
