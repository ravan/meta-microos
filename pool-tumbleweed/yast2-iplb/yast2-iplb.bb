SUMMARY = "Configuration of iplb"
DESCRIPTION = "YaST2 - Configuration of IP load balance.With this module \
you can configure a IP load balance system, frequently \
used on high availability (HA) clusters."
LICENSE = "GPL-2.0-only"

PV = "5.0.0"

RPM_NAME = "yast2-iplb-5.0.0-1.13.noarch.rpm"
RPM_HASH = "af09b070770b39470d38f4af8de6ebdb9189371b807c540ef951f210abd288e2d85594d29bbe6b6246ae40d37a490086c8683b8daa661d393cc06bb6db143e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-iplb"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
