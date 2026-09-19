SUMMARY = "OpenPrinting optional cups-browsed for CUPS"
DESCRIPTION = "cups-browsed auto-discovers printers which are announced \
via DNS-SD and auto-creates local print queues for them. \
Normally the cups-browsed.service should not be activated \
because it is a generic security risk when a service accepts \
any (possibly malicious) incoming information from any host \
in the local network (in particular DNS-SD announcements) and \
from that information it auto-creates print queue configurations \
for CUPS where the CUPS server program cupsd runs as root. \
Both cupsd and cups-browsed are network services \
that are designed for use in a trusted internal network \
and not intended to be exposed to the public Internet \
or to other non-trusted networks which means: \
It is crucial to limit access to cupsd and cups-browsed to trusted users. \
It is crucial to limit access to network printer devices to trusted users. \
It is crucial to not accept remote printing information from untrusted hosts. \
For more information see the openSUSE support database article \
https://en.opensuse.org/SDB:CUPS_and_SANE_Firewall_settings"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT"

PV = "1.28.17"

RPM_NAME = "cups-filters-cups-browsed-1.28.17-9.1.aarch64.rpm"
RPM_HASH = "4b57821bc847a569f0e88781266a814a69e05fae7a641f798154189d04cd48227fa2e218ba29cfec1839ac587b6d4a476e1effb2a31b3a472b12bc1fc70ea4fb"

RPROVIDES:${PN} += "config-cups-filters-cups-browsed \
cups-browsed \
cups-filters-cups-browsed"

RDEPENDS:${PN} += "/usr/bin/sh \
cups-filters \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libcups.so.2 \
libcupsfilters.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
