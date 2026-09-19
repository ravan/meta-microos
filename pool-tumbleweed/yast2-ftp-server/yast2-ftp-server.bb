SUMMARY = "YaST2 - FTP configuration"
DESCRIPTION = "This package contains the YaST2 component for FTP configuration. It can \
configure vsftpd."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-ftp-server-5.0.1-1.2.noarch.rpm"
RPM_HASH = "4e7df20908364459b0076b16453117a6fdd175d6e00fbbb3ec59d5e52ef603f2651195ea2c62ac85428a1451aab25354cf87f96a7ffa924d887e80a77d0b7f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-ftp-server"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings \
yast2-users"

inherit rpm
