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

RPM_NAME = "libmilter-doc-8.18.2-3.3.noarch.rpm"
RPM_HASH = "136543371861253ae24f33d25fdebfc9833c17650d74f5849495517111319866fdb5dcc12fb67a59094eb8a910380a45e9d4f984328917455f736bb895a470d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmilter-doc"

RDEPENDS:${PN} += "libmilter1-0"

inherit rpm
