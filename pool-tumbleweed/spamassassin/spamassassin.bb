SUMMARY = "Extensible email filter which is used to identify spam"
DESCRIPTION = "spamassassin adds a header line that shows if the mail has been \
determined spam or not. This way, you can decide what to do with the \
mail within the scope of your own filtering rules in your MUA (Mail \
User Agent, your mail program) or your LDA (Local Delivery Agent). \
 \
See the files in the documentation directory \
/usr/share/doc/packages/spamassassin/ for more information on how to \
use the filter."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "spamassassin-4.0.1-78.12.aarch64.rpm"
RPM_HASH = "8a99cfb661d9e110a3a4050dbe725e3dbf12eaa2d9afc5d1260fe842a67186a026f1e9451be0d7e94125f54d1fc877aa8a4b818c27f4c5b8a03791fa999013b1"

RPROVIDES:${PN} += "spamassassin"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
perl-Archive--Tar \
perl-Error \
perl-IO--Zlib \
perl-LWP \
perl-Mail--SpamAssassin \
perl-Net--Server--PreForkSimple \
re2c \
spamassassin-spamc"

inherit rpm
