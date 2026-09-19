SUMMARY = "Object oriented interface to SNMP"
DESCRIPTION = "The Net::SNMP module abstracts the intricate details of the Simple \
Network Management Protocol by providing a high level programming \
interface to the protocol. Each Net::SNMP object provides a one-to-one \
mapping between a Perl object and a remote SNMP agent or manager. Once an \
object is created, it can be used to perform the basic protocol exchange \
actions defined by SNMP. \
 \
Authors: \
-------- \
    David M. Town <dtown@fore.com>"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "6.0.1"

RPM_NAME = "perl-Net-SNMP-6.0.1-20.40.noarch.rpm"
RPM_HASH = "eef4f579ef00d3ff3f98efdb8ddaebb61d3010b01abdcc700d59eea193e4c3312d360f0bec16030aaf2f0ec3a1a2714055baff05f8c45cf83f0afd08d0f74d72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--SNMP \
perl-Net--SNMP--Dispatcher \
perl-Net--SNMP--Message \
perl-Net--SNMP--MessageProcessing \
perl-Net--SNMP--PDU \
perl-Net--SNMP--Security \
perl-Net--SNMP--Security--Community \
perl-Net--SNMP--Security--USM \
perl-Net--SNMP--Transport \
perl-Net--SNMP--Transport--IPv4 \
perl-Net--SNMP--Transport--IPv4--TCP \
perl-Net--SNMP--Transport--IPv4--UDP \
perl-Net--SNMP--Transport--IPv6 \
perl-Net--SNMP--Transport--IPv6--TCP \
perl-Net--SNMP--Transport--IPv6--UDP \
perl-Net-SNMP"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Carp \
perl-Crypt--DES \
perl-Crypt--Rijndael \
perl-Digest--HMAC \
perl-Digest--MD5 \
perl-Digest--SHA1 \
perl-Errno \
perl-Exporter \
perl-IO--Socket \
perl-Socket6"

inherit rpm
