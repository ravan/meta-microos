SUMMARY = "PPD compatibility daemon"
DESCRIPTION = "An API translation daemon that allows applications to easily transition \
to TuneD from power-profiles-daemon (PPD)."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-ppd-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "25da620e2973255bf868396e003ee5bbcc530c072e8dc37f8fc5e1ecc1ff04f7c22e03b4c8ddc856ca2c2285fb3b12cbedbcbdc984b17a4dea38d5e9046a9157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tuned-ppd \
ppd-service \
tuned-ppd"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-pyasyncore \
python3-pyinotify \
tuned"

inherit rpm
