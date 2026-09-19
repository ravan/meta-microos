SUMMARY = "Receive RSS feeds by email"
DESCRIPTION = "Lets users receive news from RSS feeds in email. Intended to be run from \
a crontab, watches RSS feeds and sends formatted email messages for new \
items."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.14"

RPM_NAME = "rss2email-3.14-3.3.noarch.rpm"
RPM_HASH = "5ebd88cf9202556cd7386b6f84e35eae997e8ae55a57e6c7acf4c9a79a092e457e96232e69649d55f58b7c624ba848eff2469917cc5c4f1e1f12d1037a8daeaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rss2email \
python3.13dist-rss2email \
python3dist-rss2email \
rss2email"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-feedparser \
python3-html2text \
python3.13dist-feedparser \
python3.13dist-html2text"

inherit rpm
