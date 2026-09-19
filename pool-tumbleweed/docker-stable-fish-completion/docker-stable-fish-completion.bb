SUMMARY = "Fish completion for docker-stable"
DESCRIPTION = "Fish command line completion support for docker-stable."
LICENSE = "Apache-2.0"

PV = "24.0.9_ce"

RPM_NAME = "docker-stable-fish-completion-24.0.9_ce-19.3.noarch.rpm"
RPM_HASH = "4fa44c9f7ca4b3bc362c8d53f0e7099a34ffe59740c4be21ddff750e7d1507f5bfe40426ff224c8d6ddfa6e4962822ae92115b830e6f3dc0b90bd98fdee793a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-fish-completion \
docker-stable-fish-completion"

RDEPENDS:${PN} += "docker-stable \
fish"

inherit rpm
