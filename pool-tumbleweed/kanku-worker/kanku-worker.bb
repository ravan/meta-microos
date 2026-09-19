SUMMARY = "Worker daemon for kanku"
DESCRIPTION = "A remote worker for kanku based on RabbitMQ."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-worker-1.0.0-2.2.noarch.rpm"
RPM_HASH = "facacac4240a3eab2fb435016da4fa38ed3c5a47878237956de7db75815dc5e7bd76799270e139dc0f0c194338ab3496f2c204d79d4039c7dc01e098ce11ee02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-worker \
perl-Kanku--Daemon--Worker"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
kanku-common \
kanku-common-server \
perl-Net--AMQP--RabbitMQ \
perl-Sys--CPU \
perl-Sys--LoadAvg \
perl-Sys--MemInfo \
perl-UUID"

inherit rpm
