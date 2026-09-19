SUMMARY = "BSD Sendmail Content Management API (milter)"
DESCRIPTION = "Sendmail's Content Management API (milter) provides third-party programs to \
access mail messages as they are being processed by the Mail Transfer Agent \
(MTA), allowing them to examine and modify message content and \
meta-information. Filtering policies implemented by Milter-conformant filters \
may then be centrally configured and composed in an end-user's MTA \
configuration file. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.18.2"

RPM_NAME = "libmilter1_0-8.18.2-3.3.aarch64.rpm"
RPM_HASH = "b44de9d2a62f6a86704e3cdcfeea5e3de8c4345f88eabfb8f420faa999a5428478c6876e9c2ebec4e8a35724b83f87289e2a5833c846cc769ac3acaa0c803b9c"

RPROVIDES:${PN} += "libmilter.so.1.0 \
libmilter1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
