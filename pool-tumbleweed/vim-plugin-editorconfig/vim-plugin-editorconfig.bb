SUMMARY = "EditorConfig plugin for Vim"
DESCRIPTION = "EditorConfig helps developers define and maintain consistent coding styles \
between different editors and IDEs. The EditorConfig project consists of a file \
format for defining coding styles and a collection of text editor plugins that \
enable editors to read the file format and adhere to defined styles. \
EditorConfig files are easily readable and they work nicely with version \
control systems. \
 \
This package contains a Vim plugin to support EditorConfig."
LICENSE = "BSD-2-Clause"

PV = "1.2.1"

RPM_NAME = "vim-plugin-editorconfig-1.2.1-64.2.noarch.rpm"
RPM_HASH = "58d0922c52fc2daa87920e9158380b8628457a831d29dc1d12f99ae46b4a5e693c80c5eaef12adc601a106f874c86c7d71c423bec0f7d9e1b44a0c942d843b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-editorconfig"

RDEPENDS:${PN} += "/usr/bin/sh \
editorconfig"

inherit rpm
