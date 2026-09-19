SUMMARY = "WebUI for kanku"
DESCRIPTION = "WebUI for kanku using perl Dancer"
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-web-1.0.0-2.2.noarch.rpm"
RPM_HASH = "9a81322ffaf6f5b1a3cd6a6860839303f95d3154a47eb9f8cdbd5382ccaa47002e4969281db5b8194a74d394fafb8d356457fbf578f2fb8ec9557c3ba38d6344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-kanku-web \
kanku-web \
perl-Dancer2--Plugin--GitLab--Webhook \
perl-Kanku \
perl-Kanku--REST \
perl-Kanku--REST--Admin--Role \
perl-Kanku--REST--Admin--Task \
perl-Kanku--REST--Admin--User \
perl-Kanku--REST--Guest \
perl-Kanku--REST--Job \
perl-Kanku--REST--JobComment \
perl-Kanku--REST--JobGroup \
perl-Kanku--REST--Worker"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
group-kanku \
kanku-common \
kanku-common-server \
perl-Dancer2--Plugin--WebSocket \
perl-Mail--Message--Body--String \
perl-Mail--Transport--Send \
perl-Net--AMQP--RabbitMQ \
perl-Template--Plugin--JSON--Escape \
perl-Twiggy \
perl-UUID \
smtp-daemon \
user-kankurun"

inherit rpm
