SUMMARY = "A utility for sending push notifications"
DESCRIPTION = "ntfy brings notification to your shell. It can automatically provide \
desktop notifications when long running commands finish or it can send \
push notifications to your phone when a specific command finishes. \
 \
Quickstart \
---------- \
 \
    $ ntfy send test \
     \
     \
    $ ntfy done sleep 10"
LICENSE = "GPL-3.0-only"

PV = "2.7.1"

RPM_NAME = "python314-ntfy-2.7.1-2.4.noarch.rpm"
RPM_HASH = "04b365734ef09642cd6d6726dc8300b9f0e4ed823b05b6e3bbaaa30b8636a1705be28d09c2f0fa1a565c82ee5bed422eacad6ee933acd3653a69128f639fdb3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ntfy \
python314-ntfy \
python3dist-ntfy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-appdirs \
python314-requests \
python314-ruamel.yaml"

inherit rpm
