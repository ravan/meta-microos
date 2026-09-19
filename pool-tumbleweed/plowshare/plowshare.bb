SUMMARY = "Download and upload files from file-sharing websites"
DESCRIPTION = "plowshare is a command-line (CLI) download/upload tool for popular file \
sharing websites (aka file hosting provider or One-Click hoster). With \
plowshare, you will be able to download or upload files and manage remote \
folders and link deletion. It runs on Linux/BSD/Unix operating system. The \
basic concept is that files can be downloaded and uploaded though command \
line as easily as wget (or curl)."
LICENSE = "GPL-3.0+"

PV = "2.1.7"

RPM_NAME = "plowshare-2.1.7-3.8.noarch.rpm"
RPM_HASH = "c7c766b09352515ab1fdbe5a04d35aa001d33716dfe0371d71d35f1f16662a118ca90e50421d2b971bea20a37ea7ac7826b7d353c58ee7db1a6533f7fbfc8b95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-plowshare \
plowshare \
plowshare-bash-completion"

RDEPENDS:${PN} += "/usr/bin/env \
bash \
curl \
perl \
perl-HTML--Entities"

inherit rpm
