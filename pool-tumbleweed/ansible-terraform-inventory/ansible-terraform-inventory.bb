SUMMARY = "Generate a dynamic Ansible inventory from a Terraform state file"
DESCRIPTION = "This is a little Go app which generates a dynamic Ansible inventory from a \
Terraform state file. It allows one to spawn a bunch of instances with \
Terraform, then (re-)provision them with Ansible. \
 \
The following providers are supported: \
 \
* AWS \
* CloudStack \
* DigitalOcean \
* Docker \
* Exoscale \
* Google Compute Engine \
* Hetzner Cloud \
* libvirt \
* Linode \
* OpenStack \
* Packet \
* ProfitBricks \
* Scaleway \
* SoftLayer \
* VMware \
* Nutanix \
* Open Telekom Cloud \
* Yandex.Cloud \
* Telmate/Proxmox \
 \
It's very simple to add support for new providers. See pull requests with the \
provider label for examples."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "ansible-terraform-inventory-0.10-3.10.aarch64.rpm"
RPM_HASH = "4f0b7c453f97276b7cdcd0234056ddd82cd4d91a7862b8e34e2524593a0f2992b32d15b4aad5f27982c3753ccac9a27930a5778f531d64909a5c30bf0ac2fd5a"

RPROVIDES:${PN} += "ansible-terraform-inventory \
terraform-inventory"

RDEPENDS:${PN} += ""

inherit rpm
