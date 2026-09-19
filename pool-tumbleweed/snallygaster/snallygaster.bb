SUMMARY = "Tool to scan for hidden files on HTTP servers"
DESCRIPTION = "A tool that looks for files accessible on web servers that shouldn't be public \
and can pose a security risk. \
 \
Typical examples include publicly accessible git repositories, backup files \
potentially containing passwords or database dumps. In addition, it contains \
a few checks for other security vulnerabilities."
LICENSE = "0BSD"

PV = "0.0.14"

RPM_NAME = "snallygaster-0.0.14-1.3.noarch.rpm"
RPM_HASH = "046ed224fb5d0a3136baf9480486197190fc40ce659a97f796a2d882609c893680a56c7ada2f1faaed579e196175d22dedfb512247336d2944374e314e18e242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-snallygaster \
python3dist-snallygaster \
snallygaster"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-base \
python3-dnspython \
python3-lxml \
python3-urllib3"

inherit rpm
