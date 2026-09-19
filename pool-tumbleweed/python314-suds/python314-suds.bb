SUMMARY = "Lightweight SOAP client"
DESCRIPTION = "Suds is a lightweight SOAP-based web service client for Python. \
 \
Although the original suds package stopped releasing versions after \
0.4, many (but not all) other open source projects moved to a \
maintained fork known as 'suds-jurko'. This is a community fork of \
that fork that is releasing packages under the main suds package name \
(and suds-community for consistency until version 2.x of this \
package)."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "python314-suds-1.2.0-4.4.noarch.rpm"
RPM_HASH = "23974db11159f06c4125ca1350c73b5fab9f5e423ffbe3fb7e60e82b4fa9a6c249c3b7d8329f3cd21037113bf9f9ff73ea9c3846b58c66b278d77800547e465d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-suds-community \
python314-suds \
python314-suds-community \
python314-suds-jurko \
python3dist-suds-community"

RDEPENDS:${PN} += "python-abi"

inherit rpm
