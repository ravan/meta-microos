SUMMARY = "Represent and manage a libvirt hypervisor connection"
DESCRIPTION = "The Sys::Virt module provides a Perl XS binding to the libvirt virtual \
machine management APIs. This allows machines running within arbitrary \
virtualization containers to be managed with a consistent API."
LICENSE = "ClArtistic | GPL-2.0-or-later"

PV = "12.7.0"

RPM_NAME = "perl-Sys-Virt-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "85f1ac58d0e9a23e3df1edab3ea17c62943847322cb50793e1f03d56b9728ed076e5b6aa66c610477483d3e3561f8116c844b1ac9dc597ac8c3e301c90043b66"

RPROVIDES:${PN} += "perl-Sys--Virt \
perl-Sys--Virt--Domain \
perl-Sys--Virt--DomainCheckpoint \
perl-Sys--Virt--DomainSnapshot \
perl-Sys--Virt--Error \
perl-Sys--Virt--Event \
perl-Sys--Virt--EventImpl \
perl-Sys--Virt--Interface \
perl-Sys--Virt--NWFilter \
perl-Sys--Virt--NWFilterBinding \
perl-Sys--Virt--Network \
perl-Sys--Virt--NetworkPort \
perl-Sys--Virt--NodeDevice \
perl-Sys--Virt--Secret \
perl-Sys--Virt--StoragePool \
perl-Sys--Virt--StorageVol \
perl-Sys--Virt--Stream \
perl-Sys-Virt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt.so.0 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
