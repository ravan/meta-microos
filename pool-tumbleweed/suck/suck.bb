SUMMARY = "Reading News Offline"
DESCRIPTION = "Suck is a program used to grab news from a remote NNTP news server and \
bring it to a local machine, without having the remote server do \
anything special."
LICENSE = "SUSE-Public-Domain"

PV = "4.3.5"

RPM_NAME = "suck-4.3.5-1.15.aarch64.rpm"
RPM_HASH = "37253adf28a7120e1896d311562dc7076e711047255342cb1042ad218cf1948f37190f03ce661d5924540e9f47a7c3b4219c2366a2f02eaa18b21f791b8af4c5"

RPROVIDES:${PN} += "suck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libssl.so.3 \
perl"

inherit rpm
