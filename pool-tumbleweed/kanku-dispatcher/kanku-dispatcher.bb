SUMMARY = "Dispatcher daemon for kanku"
DESCRIPTION = "A dispatcher for kanku based on RabbitMQ."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-dispatcher-1.0.0-2.2.noarch.rpm"
RPM_HASH = "0f11fa6dead08181603094f77cab7377266efc91bd09ffe0724c2f4a3d77d44650f10c6614fb183fd7448520219a03098720099790dcf08eea4a70325d414114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-dispatcher \
perl-Kanku--Daemon--Dispatcher \
perl-Kanku--Dispatch--RabbitMQ"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
kanku-common \
kanku-common-server \
perl-Net--AMQP--RabbitMQ \
sudo"

inherit rpm
