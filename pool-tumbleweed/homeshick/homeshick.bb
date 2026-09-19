SUMMARY = "Dotfile synchronizer based on Git and Bash"
DESCRIPTION = "Homeshick is a tool for users to manage configuration files, also known as \
dotfiles. It leverages Git repositories to store and version dotfiles, and to \
synchronize dotfile repositories between accounts and/or machines. \
 \
For example, this allows managing personal dotfiles alongside emacs or vim \
plugins without clutter. It also makes it easy to install large external \
frameworks, such as oh-my-zsh, found on sites like https://dotfiles.github.io/."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "homeshick-2.0.1-1.9.noarch.rpm"
RPM_HASH = "0df36eff60d23f75e5b58d01028f729b6c91a315efd1f171bce4e76f521bde50f1382b3f18729b34297df8b9fc066c06b924f772ae0f4647b3c969bcb12cecc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "homeshick"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
bash \
git"

inherit rpm
