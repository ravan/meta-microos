SUMMARY = "IRC gateway for slack and rocket.chat"
DESCRIPTION = "IRC gateway for slack, running on localhost for one user. This project is a replacement for slack's IRC gateway that they dropped. \
 \
One instance of localslackirc connects to one slack account and one IRC client, passing the messages between the two. \
 \
localslackirc also supports Rocket.Chat."
LICENSE = "GPL-3.0-only"

PV = "1.33+git.1739989938.1a93818"

RPM_NAME = "localslackirc-1.33+git.1739989938.1a93818-1.4.noarch.rpm"
RPM_HASH = "cd8071fbbbed095acd6c795c8416fa5dcfb5533f3c261a531ca7a8eac80c034db5f0ca24fa93b8aa40eeb1e1a9d036fbec1535e8e54ed65a55ef7e5496fef8e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-localslackirc \
localslackirc"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-typedload \
python3-websockets \
systemd"

inherit rpm
