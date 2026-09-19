SUMMARY = "Pylons Sphinx themes for documentation styling"
DESCRIPTION = "This repository is a Python package that contains Sphinx themes for Pylons \
related projects. This project is based on Pylons Sphinx Theme (singular), \
but uses a package implementation instead of git submodules and \
manual steps. \
 \
To use a theme in your Sphinx documentation, follow the guide in README.md."
LICENSE = "SUSE-Repoze"

PV = "1.0.13"

RPM_NAME = "python313-pylons-sphinx-themes-1.0.13-3.5.noarch.rpm"
RPM_HASH = "e7e59b29a4edb798a03ac7ebfee1be1a19ebc2266f25eab7c521a6318cdbf3077a9a2abab2c0971efdd61970949ee0073f155cc589cf63b3028acf3313760039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylons-sphinx-theme \
python3-pylons-sphinx-themes \
python3-pylons-theme-support \
python3.13dist-pylons-sphinx-themes \
python313-pylons-sphinx-theme \
python313-pylons-sphinx-themes \
python313-pylons-theme-support \
python3dist-pylons-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python313-Pygments"

inherit rpm
