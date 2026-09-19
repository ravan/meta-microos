SUMMARY = "The Python Gateway Script: news2mail mail2news gateway"
DESCRIPTION = "Python Gateway Script from news to mail and vice versa. \
 \
It is intended to be a full SMTP/NNTP rfc compliant gateway \
with whitelist manager. \
 \
You will probably have to install a mail-transport-agent and/or \
news-transport-system package to manage SMTP/NNTP traffic. \
 \
MTA is needed for mail2news service, since mail have to be \
processed on a box where pyg is installed. You can use a remote \
smtpserver for news2mail. \
 \
News system is useful but not needed, since you can send articles to a \
remote SMTP server (ie: moderated NG) where is installed pyg, otherwise you \
will need it. \
 \
It refers to rfc 822 (mail) and 850 (news)."
LICENSE = "GPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "python314-pygn-0.12.0-1.7.noarch.rpm"
RPM_HASH = "7ee6fa6e03861fe3e7651c3c5f75025b93889ba9818a9b9f6db3a30c9ab10bc03fc4f6995de7598d6e2acc38a1acd9d123ae2c0daf49c3f4d39038f585c20641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygn \
python314-pygn \
python3dist-pygn"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-rply \
update-alternatives"

inherit rpm
