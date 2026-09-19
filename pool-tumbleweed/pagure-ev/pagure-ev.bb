SUMMARY = "EventSource server for pagure"
DESCRIPTION = "Pagure comes with an eventsource server allowing live update of the pages \
supporting it. This package provides it."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-ev-5.14.1-3.3.noarch.rpm"
RPM_HASH = "8f4a998bec5fab928227d2fcf7e3ad26831692afd6ae3eccce34cb8db3b7f6930177f4997d30bba4ddaa8bfece21546d9dd342b0756c6fe19a1c293f96df877d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-ev"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
pagure \
python3-Trololio \
systemd"

inherit rpm
