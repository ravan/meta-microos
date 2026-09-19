SUMMARY = "Command line client for kanku"
DESCRIPTION = "Command line client for kanku, mainly used for setup tasks \
and in developer mode."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-cli-1.0.0-2.2.noarch.rpm"
RPM_HASH = "eefc9958259b01d9cf413d397f76619c3867ef0ac88f0768da8f843088c3ecd763434618eddd2b85b99fbd288e27c4e3b9e17abeb59ca6522ac7fa0aded64655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-cli \
perl-Kanku--Cli \
perl-Kanku--Cli--Api \
perl-Kanku--Cli--Browser \
perl-Kanku--Cli--CA--Create \
perl-Kanku--Cli--CheckConfigs--Devel \
perl-Kanku--Cli--CheckConfigs--Server \
perl-Kanku--Cli--Console \
perl-Kanku--Cli--DB--Install \
perl-Kanku--Cli--DB--Status \
perl-Kanku--Cli--DB--Upgrade \
perl-Kanku--Cli--Destroy \
perl-Kanku--Cli--Doc \
perl-Kanku--Cli--Hub--Gpgimport \
perl-Kanku--Cli--Hub--Sign \
perl-Kanku--Cli--Hub--Test \
perl-Kanku--Cli--Info \
perl-Kanku--Cli--Init \
perl-Kanku--Cli--Ip \
perl-Kanku--Cli--List \
perl-Kanku--Cli--Login \
perl-Kanku--Cli--Logout \
perl-Kanku--Cli--Lsi \
perl-Kanku--Cli--Pfwd \
perl-Kanku--Cli--Rabbit \
perl-Kanku--Cli--Rcomment--Create \
perl-Kanku--Cli--Rcomment--Delete \
perl-Kanku--Cli--Rcomment--List \
perl-Kanku--Cli--Rcomment--Modify \
perl-Kanku--Cli--Retrigger \
perl-Kanku--Cli--Rguest--Console \
perl-Kanku--Cli--Rguest--List \
perl-Kanku--Cli--Rguest--Ssh \
perl-Kanku--Cli--Rhistory--Details \
perl-Kanku--Cli--Rhistory--List \
perl-Kanku--Cli--Rjob--Config \
perl-Kanku--Cli--Rjob--Details \
perl-Kanku--Cli--Rjob--List \
perl-Kanku--Cli--Roles--DB \
perl-Kanku--Cli--Roles--Hub \
perl-Kanku--Cli--Roles--Remote \
perl-Kanku--Cli--Roles--Schema \
perl-Kanku--Cli--Roles--VM \
perl-Kanku--Cli--Roles--View \
perl-Kanku--Cli--Rr \
perl-Kanku--Cli--Rtrigger \
perl-Kanku--Cli--Rworker--List \
perl-Kanku--Cli--SSH \
perl-Kanku--Cli--Setup--Devel \
perl-Kanku--Cli--Setup--Server \
perl-Kanku--Cli--Setup--Worker \
perl-Kanku--Cli--Snapshot--Create \
perl-Kanku--Cli--Snapshot--List \
perl-Kanku--Cli--Snapshot--Remove \
perl-Kanku--Cli--Snapshot--Revert \
perl-Kanku--Cli--Startui \
perl-Kanku--Cli--Startvm \
perl-Kanku--Cli--Status \
perl-Kanku--Cli--Stopui \
perl-Kanku--Cli--Stopvm \
perl-Kanku--Cli--Up \
perl-Kanku--Cli--Urlwrapper \
perl-Kanku--Cli--Verify \
perl-Moose--Meta--Attribute--Custom--Trait--AppTerm \
perl-MooseX--App--Plugin--Kanku--APIConfig \
perl-MooseX--App--Plugin--Kanku--APIConfig--Meta--Class \
perl-MooseX--App--Plugin--Kanku--Term \
perl-MooseX--App--Plugin--Kanku--Term--Meta--Attribute \
perl-MooseX--App--Plugin--Kanku--Term--Meta--Class"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
kanku-common \
libvirt-client \
libvirt-daemon \
libvirt-daemon-driver-qemu \
openssh-clients \
perl-IO--Interactive \
perl-Net--AMQP--RabbitMQ \
sudo"

inherit rpm
