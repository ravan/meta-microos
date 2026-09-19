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

RPM_NAME = "python313-pygn-0.12.0-1.7.noarch.rpm"
RPM_HASH = "8dfde7aea5fbc87f1ac8f341f203887f2d2256eada1ac8dd09d6b1ecb9280b4de429b37d04a4ec07a118473d6efcf17869b1c0bd7d5688e8e605e96988fa24e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygn \
python3.13dist-pygn \
python313-pygn \
python3dist-pygn"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-rply \
update-alternatives"

inherit rpm
