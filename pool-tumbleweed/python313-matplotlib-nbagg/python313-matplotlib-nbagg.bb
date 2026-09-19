SUMMARY = "Jupyter nbagg backend for python313-matplotlib"
DESCRIPTION = "This package includes the Jupyter notebook backend \
for the python313-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python313-matplotlib-nbagg-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "ea46286afac3feee6fabfc39ea5c0b9aa102eb1c583fc7fbcdbc1edfaef0a8f2d9a4250100de73e830287ffff8d04d0b33f940735c3a94c8def38782153f76b8"

RPROVIDES:${PN} += "python3-matplotlib-nbagg \
python313-matplotlib-nbagg"

RDEPENDS:${PN} += "python-abi \
python313-ipykernel \
python313-matplotlib"

inherit rpm
