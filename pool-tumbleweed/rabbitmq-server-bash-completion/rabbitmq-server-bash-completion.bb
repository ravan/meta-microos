SUMMARY = "Bash completion for rabbitmq-server"
DESCRIPTION = "Optional dependency offering bash completion for rabbitmq-server."
LICENSE = "MPL-2.0"

PV = "4.2.9"

RPM_NAME = "rabbitmq-server-bash-completion-4.2.9-1.1.noarch.rpm"
RPM_HASH = "f55d689f3835941a39eea5155a4e7ef5b7b9ac7f35202edeb01120173a6f8b35899b788bb808437b79f99669da30b47c18130a6bdafd7e9131155344b0f38fce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rabbitmq-server-bash-completion"

RDEPENDS:${PN} += "bash-completion \
rabbitmq-server"

inherit rpm
