SUMMARY = "A perl-script to send xmpp, similar to what mail does for mail"
DESCRIPTION = "sendxmpp is a perl-script to send xmpp (jabber), similar to \
what mail(1) does for mail."
LICENSE = "GPL-2.0-only"

PV = "1.24"

RPM_NAME = "sendxmpp-1.24-3.18.noarch.rpm"
RPM_HASH = "1241acc995c4a30b77734adc7e7351c2accad230b662bcf15c3b1685a2f58ccf3efa910066857cc494c4083e23594ebaf8b04adac490b4c21c996633371ff07f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sendxmpp"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-IO--Socket--SSL \
perl-Net--XMPP"

inherit rpm
