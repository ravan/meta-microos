SUMMARY = "Mojo::IOLoop based RabbitMQ client"
DESCRIPTION = "Mojo::RabbitMQ::Client is a rewrite of AnyEvent::RabbitMQ to work on top of \
Mojo::IOLoop."
LICENSE = "Artistic-2.0"

PV = "0.3.1"

RPM_NAME = "perl-Mojo-RabbitMQ-Client-0.3.1-1.30.noarch.rpm"
RPM_HASH = "cde1de378eb35f8a49af200fd7636469f9539bfcbc7a9fb0fa6087e2e140ddcc17e88753a0bd90ce62193d377172995f5760abd7377472a0c2a57b9f3afdd8c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--RabbitMQ--Client \
perl-Mojo--RabbitMQ--Client--Channel \
perl-Mojo--RabbitMQ--Client--Consumer \
perl-Mojo--RabbitMQ--Client--LocalQueue \
perl-Mojo--RabbitMQ--Client--Method \
perl-Mojo--RabbitMQ--Client--Method--Publish \
perl-Mojo--RabbitMQ--Client--Publisher \
perl-Mojo-RabbitMQ-Client"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--ShareDir \
perl-List--Util \
perl-Mojolicious \
perl-Net--AMQP"

inherit rpm
