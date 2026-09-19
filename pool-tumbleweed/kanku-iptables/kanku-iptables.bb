SUMMARY = "Store and restore kanku iptables rules"
DESCRIPTION = "kanku-iptables.service is required to store/restore iptables rules for \
kanku guests which are using the 'autostart' flag."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-iptables-1.0.0-2.2.noarch.rpm"
RPM_HASH = "e1d5c88cd84377f4584b3458c613a5479bdeda66e7c987fc37c9a48ddcd2b94400f88359b91aa928697522d29e6dde9ccdd8668dc0f966e7864d4e8133a7b1a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-iptables"

RDEPENDS:${PN} += "/usr/bin/sh \
kanku-common"

inherit rpm
