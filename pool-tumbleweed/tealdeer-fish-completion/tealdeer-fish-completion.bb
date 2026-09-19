SUMMARY = "Fish Completion for tealdeer"
DESCRIPTION = "Fish command-line completion support for tealdeer."
LICENSE = "Apache-2.0 | MIT"

PV = "1.8.0"

RPM_NAME = "tealdeer-fish-completion-1.8.0-1.7.noarch.rpm"
RPM_HASH = "75bd2870654853a2b11734c0e931b11893866740b49fb2d6916feb9672a267a1267f9630ba0c3de0758fd4f16c81a1ef976d61cc4d83e33d8930d54b399c2755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tealdeer-fish-completion"

RDEPENDS:${PN} += "fish \
tealdeer"

inherit rpm
